/*
 * Generated code DO NOT EDIT
 * Generated file: CtcScheduleRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class CtcScheduleRequestMethod implements UdtMethod {
  private String method = null;
  private CtcScheduleRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcScheduleCreate method */
  public static final CtcScheduleRequestMethod CTC_SCHEDULE_CREATE = new CtcScheduleRequestMethod("CtcScheduleCreate");
  /** Variable representing the CtcScheduleDelete method */
  public static final CtcScheduleRequestMethod CTC_SCHEDULE_DELETE = new CtcScheduleRequestMethod("CtcScheduleDelete");
  /** Variable representing the CtcScheduleFind method */
  public static final CtcScheduleRequestMethod CTC_SCHEDULE_FIND = new CtcScheduleRequestMethod("CtcScheduleFind");
  /** Variable representing the CtcScheduleGet method */
  public static final CtcScheduleRequestMethod CTC_SCHEDULE_GET = new CtcScheduleRequestMethod("CtcScheduleGet");
  /** Variable representing the CtcScheduleUpdate method */
  public static final CtcScheduleRequestMethod CTC_SCHEDULE_UPDATE = new CtcScheduleRequestMethod("CtcScheduleUpdate");
}
