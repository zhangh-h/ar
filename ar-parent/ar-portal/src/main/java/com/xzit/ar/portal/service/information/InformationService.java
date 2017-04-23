package com.xzit.ar.portal.service.information;

import com.xzit.ar.common.exception.ServiceException;
import com.xzit.ar.common.page.Page;
import com.xzit.ar.common.po.info.Information;

import java.util.List;
import java.util.Map;

/**
 * TODO 信息相关业务
 * Created by 董亮亮 on 2017/4/7.
 */
public interface InformationService {

    /**
     * TODO 根据information id 加载信息
     * @param infoId
     * @return
     * @throws ServiceException
     */
    Information getInfoById(Integer infoId) throws ServiceException;

    /**
     * TODO 加载组织最近消息
     * @param page  分页类
     * @param originId  组织id
     * @return  消息列表
     * @throws ServiceException
     */
    List<Map<String, Object>> getOriginInfos(Page<Map<String, Object>> page, Integer originId) throws ServiceException;

    /**
     *
     * @param page
     * @param originId
     * @param originId
     * @return
     * @throws ServiceException
     */
    List<Map<String, Object>> getOriginUserInfos(Page<Map<String, Object>> page, Integer userId, Integer originId, String infoType) throws ServiceException;

    /**
     * TODO 通过 消息id 和 组织id 获取消息详情
      * @param infoId
     * @param originId
     * @return
     * @throws ServiceException
     */
    Map<String, Object> getInfoByInfoIdAndOriginId(Integer infoId, Integer originId) throws ServiceException;

    /**
     * TODO 为消息点赞
     * @param infoId  消息id
     * @return 返回点赞的总数
     * @throws ServiceException
     */
    Integer loveInfo(Integer infoId) throws ServiceException;

    /**
     * TODO 删除消息
     * @param infoId
     * @param userId
     * @return
     * @throws ServiceException
     */
    Integer deleteInfo(Integer infoId, Integer userId) throws ServiceException;
}
