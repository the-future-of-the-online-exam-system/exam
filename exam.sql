/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : exam

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 12/08/2019 17:27:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单位名称',
  `num` int(3) NOT NULL COMMENT '单位在职人数',
  `note` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('100000000', '郑州黄河干部学校', 0, '无');
INSERT INTO `company` VALUES ('200000000', '荥阳分校', 0, '无');

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `com_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  `num` int(3) NOT NULL COMMENT '部门人数',
  `note` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('100000001', '郑州黄河干部学校', '办公室', 0, NULL);
INSERT INTO `department` VALUES ('100000002', '郑州黄河干部学校', '规计处', 0, NULL);
INSERT INTO `department` VALUES ('100000003', '郑州黄河干部学校', '干部管理处', 0, NULL);
INSERT INTO `department` VALUES ('100000004', '郑州黄河干部学校', '财务处', 0, NULL);
INSERT INTO `department` VALUES ('100000005', '郑州黄河干部学校', '人劳处', 0, NULL);
INSERT INTO `department` VALUES ('100000006', '郑州黄河干部学校', '保卫处', 0, NULL);
INSERT INTO `department` VALUES ('100000008', '郑州黄河干部学校', '培训一部', 0, NULL);
INSERT INTO `department` VALUES ('100000009', '郑州黄河干部学校', '培训二部', 0, NULL);
INSERT INTO `department` VALUES ('100000010', '郑州黄河干部学校', '培训三部', 0, NULL);
INSERT INTO `department` VALUES ('100000011', '郑州黄河干部学校', '培训四部', 0, NULL);
INSERT INTO `department` VALUES ('100000013', '郑州黄河干部学校', '学员管理部', 0, NULL);
INSERT INTO `department` VALUES ('100000014', '郑州黄河干部学校', '培训科', 0, NULL);
INSERT INTO `department` VALUES ('100000016', '郑州黄河干部学校', '审计处', 0, NULL);
INSERT INTO `department` VALUES ('100000017', '郑州黄河干部学校', '离退处', 0, NULL);
INSERT INTO `department` VALUES ('100000018', '郑州黄河干部学校', '学校直属党委', 0, NULL);
INSERT INTO `department` VALUES ('100000019', '郑州黄河干部学校', '学校工会', 0, NULL);
INSERT INTO `department` VALUES ('200000001', '郑州黄河干部学校', '基建处', 0, NULL);
INSERT INTO `department` VALUES ('200000002', '荥阳分校', '外联部', 0, NULL);
INSERT INTO `department` VALUES ('200000003', '荥阳分校', '规划部', 0, NULL);

-- ----------------------------
-- Table structure for exam_certificate
-- ----------------------------
DROP TABLE IF EXISTS `exam_certificate`;
CREATE TABLE `exam_certificate`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `account_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户编号',
  `com_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '单位编号',
  `exam_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试卷id',
  `qualified` int(1) NOT NULL COMMENT '是否合格 1合格 0不合格',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for exam_info
-- ----------------------------
DROP TABLE IF EXISTS `exam_info`;
CREATE TABLE `exam_info`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试卷名称',
  `status` int(1) NOT NULL COMMENT '状态 1可用 0不可用',
  `start_time` datetime NOT NULL COMMENT '开始时间',
  `end_time` datetime NOT NULL COMMENT '结束时间',
  `duration` int(3) NOT NULL COMMENT '考试时长',
  `total_score` int(3) NOT NULL COMMENT '总分',
  `description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试卷说明',
  `question_db_id` int(11) NULL DEFAULT NULL COMMENT '题库',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `show_mode` int(1) UNSIGNED NOT NULL COMMENT '显示模式 1单题显示 0全部显示',
  `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者',
  `multiple_num` int(3) NOT NULL COMMENT '多选题数量',
  `single_num` int(3) NOT NULL COMMENT '单选题数量',
  `blank_num` int(3) NOT NULL COMMENT '填空题数量',
  `judge_num` int(3) NOT NULL COMMENT '判断题数量',
  `note` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `title` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标题',
  `content` varchar(4000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '内容',
  `top` int(1) NOT NULL COMMENT '是否置顶 0否  1置顶',
  `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者',
  `picture` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片',
  `date` datetime NOT NULL COMMENT '发布日期',
  `note` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for question_db
-- ----------------------------
DROP TABLE IF EXISTS `question_db`;
CREATE TABLE `question_db`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '题库名称',
  `create_date` datetime NOT NULL COMMENT '创建日期',
  `creator` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for question_db_info
-- ----------------------------
DROP TABLE IF EXISTS `question_db_info`;
CREATE TABLE `question_db_info`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '考题编号',
  `question_db_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '题库id',
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '考题类型',
  `question_stem` varchar(4000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '题干',
  `option` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '选项',
  `answer` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '答案',
  `analysis` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '解析',
  `creator_date` datetime NOT NULL COMMENT '创建日期',
  `note` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`, `question_db_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色name',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_SUPERADMIN');
INSERT INTO `role` VALUES ('2', 'ROLE_DEPARTADMIN');
INSERT INTO `role` VALUES ('3', 'ROLE_USER');

-- ----------------------------
-- Table structure for score_info
-- ----------------------------
DROP TABLE IF EXISTS `score_info`;
CREATE TABLE `score_info`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `exam_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '试卷编号',
  `account_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学员编号',
  `exam_score` int(3) NOT NULL COMMENT '试卷总分',
  `score` int(3) NOT NULL COMMENT '得分',
  `note` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `department` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门id',
  `com` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '单位id',
  `title` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职称',
  `phone` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `position` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职务',
  `Email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `create_date` datetime NOT NULL COMMENT '注册日期',
  `status` int(1) NULL DEFAULT NULL COMMENT '用户状态',
  `note` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('6c1cde0d8af04de49f316766586af7c0', 'admin', '60dae9d237234eb6eb86a29e69ffb6e2', '干部管理处', '郑州黄河干部学校', 'ADMIN', '12345612345', 'ADMIN', 'qq@qq.com', '2019-08-12 17:25:48', 1, '无');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'user_id',
  `role_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'role_id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('93deb28a61cd40859d1a376b2ea346c6', '6c1cde0d8af04de49f316766586af7c0', '1');

-- ----------------------------
-- Function structure for tm_strip_tags
-- ----------------------------
DROP FUNCTION IF EXISTS `tm_strip_tags`;

SET FOREIGN_KEY_CHECKS = 1;
