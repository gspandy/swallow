/**
 * Project: swallow-producerclient
 * 
 * File Created at 2012-6-25
 * $Id$
 * 
 * Copyright 2010 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.swallow.producer;

/**
 * 配置Producer的选项
 * 
 * @author tong.song
 */
public enum ProducerOptionKey {
   /**
    * Producer工作模式：同步/异步；前缀为ASYNC_的选项：异步模式生效，同步模式忽略，类型为：{@link ProducerMode}
    */
   PRODUCER_MODE,
   /**
    * 发送消息的失败重试次数，类型：int
    */
   RETRY_TIMES,
   /**
    * 是否压缩消息，类型：boolean
    */
   IS_ZIP_MESSAGE,
   /**
    * 异步模式时，从队列中获取并发送消息的线程池大小，类型：int
    */
   ASYNC_THREAD_POOL_SIZE,
   /**
    * 异步模式时，重启Producer是否续接上次的队列，继续发送，类型：boolean
    */
   ASYNC_IS_CONTINUE_SEND
}
