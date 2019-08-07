layui.define(['layer', 'form', 'laytpl'], function(exports) {
	"use strict";

	let $ = layui.$,
		form = layui.form,
		layarea = {
			_id: 0,
			config: {},
			set: function(options) {
				let that = this;
				that.config = $.extend({}, that.config, options);
				return that;
			},
			on: function(events, callback) {
				return layui.onevent.call(this, 'layarea', events, callback);
			}
		},
		thisArea = function() {
			let that = this;
			return {
				layarea: function(files) {
					that.layarea.call(that, files);
				},
				config: that.config
			}
		},
		Class = function(options) {
			let that = this;
			that.config = $.extend({}, that.config, layarea.config, options);
			that.render();
		};

	let areaList = {
		Com_list: {
			100000000: '郑州黄河干部学校',
			200000000: '荥阳分校'
		},

		Depart_list: {
			100000001: '办公室',
			100000002: '规计处',
			100000003: '干部管理处',
			100000004: '财务处',
			100000005: '人劳处',
			100000006: '保卫处',
			100000007: '后勤公司管理处',
			100000008: '培训一部',
			100000009: '培训二部',
			100000010: '培训三部',
			100000011: '培训四部',
			100000012: '培训五部',
			100000013: '学员管理部',
			100000014: '培训科',
			100000015: '监察处',
			100000016: '审计处',
			100000017: '离退处',
			100000018: '学校直属党委',
			100000019: '学校工会',
			200000001: '基建处',
			200000002: '外联部',
			200000003: '规划部'
		}
	};


	Class.prototype.config = {
		elem: '',
		data: {
			Com: '--选择单位--',
			Depart: '--选择部门--'
			// county: '--选择区--',
		},
		change: function(result) {}
	};

	Class.prototype.index = 0;

	Class.prototype.render = function() {
		let that = this,
			options = that.config;
		options.elem = $(options.elem);
		options.bindAction = $(options.bindAction);

		that.events();
	};

	Class.prototype.events = function() {
		let that = this,
			options = that.config,
			index;
		let ComFilter = 'Com-' + layarea._id;
		let DepartFilter = 'Depart-' + layarea._id;

		let ComEl = options.elem.find('.Com-selector');
		let DepartEl = options.elem.find('.Depart-selector');

		//filter
		if (ComEl.attr('lay-filter')) {
			ComFilter = ComEl.attr('lay-filter');
		}
		if (DepartEl.attr('lay-filter')) {
			DepartFilter = DepartEl.attr('lay-filter');
		}
		ComEl.attr('lay-filter', ComFilter);
		DepartEl.attr('lay-filter', DepartFilter);

		//获取默认值
		if (ComEl.data('value')) {
			options.data.Com = ComEl.data('value');
		}
		if (DepartEl.data('value')) {
			options.data.Depart = DepartEl.data('value');
		}
		ComEl.attr('lay-filter', ComFilter);
		DepartEl.attr('lay-filter', DepartFilter);

		//监听结果
		form.on('select(' + ComFilter + ')', function(data) {
			options.data.Com = data.value;
			let code = getCode('Com', data.value);
			renderDepart(code);

			options.change(options.data);
		});
		form.on('select(' + DepartFilter + ')', function(data) {
			options.data.Depart = data.value;
			let code = getCode('Depart', data.value);

			options.change(options.data);
		});

		renderCom();

		//查找Com
		function renderCom() {
			let tpl = '';
			let ComList = getList("Com");
			let currentCode = '';
			let currentName = '';
			ComList.forEach(function(_item) {
				if (!currentCode) {
					currentCode = _item.code;
					currentName = _item.name;
				}
				if (_item.name === options.data.Com) {
					currentCode = _item.code;
					currentName = _item.name;
				}
				tpl += '<option value="' + _item.name + '">' + _item.name + '</option>';
			});
			options.data.Com = currentName;
			ComEl.html(tpl);
			ComEl.val(options.data.Com);
			form.render('select');
			renderDepart(currentCode);
		}

		function renderDepart(ComCode) {
			let tpl = '';
			let DepartList = getList('Depart', ComCode.slice(0, 2));
			let currentCode = '';
			let currentName = '';
			DepartList.forEach(function(_item) {
				if (!currentCode) {
					currentCode = _item.code;
					currentName = _item.name;
				}
				if (_item.name === options.data.Depart) {
					currentCode = _item.code;
					currentName = _item.name;
				}
				tpl += '<option value="' + _item.name + '">' + _item.name + '</option>';
			});
			options.data.Depart = currentName;
			DepartEl.html(tpl);
			DepartEl.val(options.data.Depart);
			form.render('select');
		}


		function getList(type, code) {
			let result = [];

			if (type !== 'Com' && !code) {
				return result;
			}

			let list = areaList[type + "_list"] || {};
			result = Object.keys(list).map(function(code) {
				return {
					code: code,
					name: list[code]
				};
			});

			if (code) {
				// oversea code
				if (code[0] === '9' && type === 'Depart') {
					code = '9';
				}

				result = result.filter(function(item) {
					return item.code.indexOf(code) === 0;
				});
			}

			return result;
		}

		function getCode(type, name) {
			let code = '';
			let list = areaList[type + "_list"] || {};
			layui.each(list, function(_code, _name) {
				if (_name === name) {
					code = _code;
				}
			});

			return code;
		}
	};

	layarea.render = function(options) {
		let inst = new Class(options);
		layarea._id++;
		return thisArea.call(inst);
	};

	//暴露接口
	exports('layarea', layarea);
});
