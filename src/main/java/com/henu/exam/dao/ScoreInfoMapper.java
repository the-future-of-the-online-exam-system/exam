package com.henu.exam.dao;

import com.henu.exam.bean.ScoreInfo;

public interface ScoreInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_info
     *
     * @mbg.generated Mon Aug 12 14:19:13 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_info
     *
     * @mbg.generated Mon Aug 12 14:19:13 CST 2019
     */
    int insert(ScoreInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_info
     *
     * @mbg.generated Mon Aug 12 14:19:13 CST 2019
     */
    int insertSelective(ScoreInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_info
     *
     * @mbg.generated Mon Aug 12 14:19:13 CST 2019
     */
    ScoreInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_info
     *
     * @mbg.generated Mon Aug 12 14:19:13 CST 2019
     */
    int updateByPrimaryKeySelective(ScoreInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_info
     *
     * @mbg.generated Mon Aug 12 14:19:13 CST 2019
     */
    int updateByPrimaryKey(ScoreInfo record);
}