/**
 * Copyright (c) 2017 ZHONGHENG, Inc. All rights reserved.
 * This software is the confidential and proprietary information of
 * ZHONGHENG, Inc. You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with ZHONGHENG.
 */
package com.finacne.common.utils;

import com.github.stuxuhai.jpinyin.ChineseHelper;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Des: 拼音工具类
 * ClassName: PinYinUtil
 * Author: biqiang2017@163.com
 * Date: 2018/7/23
 * Time: 10:11
 */
public class PinYinUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PinYinUtil.class);


    /**
     * 转换为有声调的拼音字符串
     *
     * @param pinYinStr 汉字
     * @return 有声调的拼音字符串
     */
    public static String changeToMarkPinYin(String pinYinStr) {

        String tempStr = null;

        try {
            tempStr = PinyinHelper.convertToPinyinString(pinYinStr, "", PinyinFormat.WITH_TONE_MARK);
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }
        return tempStr;

    }


    /**
     * 转换为数字声调字符串
     *
     * @param pinYinStr 需转换的汉字
     * @return 转换完成的拼音字符串
     */
    public static String changeToNumberPinYin(String pinYinStr) {

        String tempStr = null;

        try {
            tempStr = PinyinHelper.convertToPinyinString(pinYinStr, "", PinyinFormat.WITH_TONE_NUMBER);
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }

        return tempStr;

    }

    /**
     * 转换为不带音调的拼音字符串
     *
     * @param pinYinStr 需转换的汉字
     * @return 拼音字符串
     */
    public static String changeToTonePinYin(String pinYinStr) {

        String tempStr = null;

        try {
            tempStr = PinyinHelper.convertToPinyinString(pinYinStr, "", PinyinFormat.WITHOUT_TONE);
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }
        return tempStr;

    }

//    /**
//     * 转换为首字母大写拼音字符串
//     *
//     * @param pinYinStr 需转换的汉字
//     * @return 拼音字符串
//     */
//    public static String changeToTitleCasePinYin(String pinYinStr) {
//
//        String tempStr = null;
//        for (int i=0; i < pinYinStr.length(); i++){
//
//        }
//        try {
//            tempStr = PinyinHelper.convertToPinyinString(pinYinStr, "", PinyinFormat.WITHOUT_TONE);
//        } catch (Exception e) {
//            LOGGER.error("Exception", e);
//        }
//        return tempStr;
//
//    }

    /**
     * 转换为每个汉字对应拼音首字母字符串
     *
     * @param pinYinStr 需转换的汉字
     * @return 拼音字符串
     */
    public static String changeToGetShortPinYin(String pinYinStr) {

        String tempStr = null;

        try {
            tempStr = PinyinHelper.getShortPinyin(pinYinStr);
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }
        return tempStr;

    }

    /**
     * 检查汉字是否为多音字
     *
     * @param pinYinStr 需检查的汉字
     * @return true 多音字，false 不是多音字
     */
    public static boolean checkPinYin(char pinYinStr) {

        boolean check = false;
        try {
            check = PinyinHelper.hasMultiPinyin(pinYinStr);
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }
        return check;
    }

    /**
     * 简体转换为繁体
     *
     * @param pinYinStr
     * @return
     */
    public static String changeToTraditional(String pinYinStr) {

        String tempStr = null;
        try {
            tempStr = ChineseHelper.convertToTraditionalChinese(pinYinStr);
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }
        return tempStr;

    }

    /**
     * 繁体转换为简体
     *
     * @param pinYinSt
     * @return
     */
    public static String changeToSimplified(String pinYinSt) {

        String tempStr = null;

        try {
            tempStr = ChineseHelper.convertToSimplifiedChinese(pinYinSt);
        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }

        return tempStr;

    }

//    public static void main(String[] args) {
//        PinyinHelper.convertToPinyinArray("你好");
//        System.out.println(PinYinUtil.changeToGetShortPinYin("你好"));
//    }

}
