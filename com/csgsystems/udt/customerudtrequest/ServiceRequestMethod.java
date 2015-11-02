/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceAlternateGet method */
  public static final ServiceRequestMethod SERVICE_ALTERNATE_GET = new ServiceRequestMethod("ServiceAlternateGet");
  /** Variable representing the ServiceCreate method */
  public static final ServiceRequestMethod SERVICE_CREATE = new ServiceRequestMethod("ServiceCreate");
  /** Variable representing the ServiceExtendedDataFind method */
  public static final ServiceRequestMethod SERVICE_EXTENDED_DATA_FIND = new ServiceRequestMethod("ServiceExtendedDataFind");
  /** Variable representing the ServiceExternalFind method */
  public static final ServiceRequestMethod SERVICE_EXTERNAL_FIND = new ServiceRequestMethod("ServiceExternalFind");
  /** Variable representing the ServiceExternalFindAll method */
  public static final ServiceRequestMethod SERVICE_EXTERNAL_FIND_ALL = new ServiceRequestMethod("ServiceExternalFindAll");
  /** Variable representing the ServiceExternalGet method */
  public static final ServiceRequestMethod SERVICE_EXTERNAL_GET = new ServiceRequestMethod("ServiceExternalGet");
  /** Variable representing the ServiceFind method */
  public static final ServiceRequestMethod SERVICE_FIND = new ServiceRequestMethod("ServiceFind");
  /** Variable representing the ServiceFindCount method */
  public static final ServiceRequestMethod SERVICE_FIND_COUNT = new ServiceRequestMethod("ServiceFindCount");
  /** Variable representing the ServiceFindWithExtendedData method */
  public static final ServiceRequestMethod SERVICE_FIND_WITH_EXTENDED_DATA = new ServiceRequestMethod("ServiceFindWithExtendedData");
  /** Variable representing the ServiceGet method */
  public static final ServiceRequestMethod SERVICE_GET = new ServiceRequestMethod("ServiceGet");
  /** Variable representing the ServiceSequenceGet method */
  public static final ServiceRequestMethod SERVICE_SEQUENCE_GET = new ServiceRequestMethod("ServiceSequenceGet");
  /** Variable representing the ServiceUpdate method */
  public static final ServiceRequestMethod SERVICE_UPDATE = new ServiceRequestMethod("ServiceUpdate");
  /** Variable representing the ServiceUpdateValidate method */
  public static final ServiceRequestMethod SERVICE_UPDATE_VALIDATE = new ServiceRequestMethod("ServiceUpdateValidate");
  /** Variable representing the ServiceWithNonServiceMoveFind method */
  public static final ServiceRequestMethod SERVICE_WITH_NON_SERVICE_MOVE_FIND = new ServiceRequestMethod("ServiceWithNonServiceMoveFind");
  /** Variable representing the ServiceWithPendingFind method */
  public static final ServiceRequestMethod SERVICE_WITH_PENDING_FIND = new ServiceRequestMethod("ServiceWithPendingFind");
}
