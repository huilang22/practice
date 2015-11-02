/*
 * Generated code DO NOT EDIT
 * Generated file: NrcRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class NrcRequestMethod implements UdtMethod {
  private String method = null;
  private NrcRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the NrcAlternateGet method */
  public static final NrcRequestMethod NRC_ALTERNATE_GET = new NrcRequestMethod("NrcAlternateGet");
  /** Variable representing the NrcBillToReevaluate method */
  public static final NrcRequestMethod NRC_BILL_TO_REEVALUATE = new NrcRequestMethod("NrcBillToReevaluate");
  /** Variable representing the NrcCreate method */
  public static final NrcRequestMethod NRC_CREATE = new NrcRequestMethod("NrcCreate");
  /** Variable representing the NrcDelete method */
  public static final NrcRequestMethod NRC_DELETE = new NrcRequestMethod("NrcDelete");
  /** Variable representing the NrcDeleteValidate method */
  public static final NrcRequestMethod NRC_DELETE_VALIDATE = new NrcRequestMethod("NrcDeleteValidate");
  /** Variable representing the NrcExtendedDataFind method */
  public static final NrcRequestMethod NRC_EXTENDED_DATA_FIND = new NrcRequestMethod("NrcExtendedDataFind");
  /** Variable representing the NrcExternalFind method */
  public static final NrcRequestMethod NRC_EXTERNAL_FIND = new NrcRequestMethod("NrcExternalFind");
  /** Variable representing the NrcFind method */
  public static final NrcRequestMethod NRC_FIND = new NrcRequestMethod("NrcFind");
  /** Variable representing the NrcFindByServiceOrder method */
  public static final NrcRequestMethod NRC_FIND_BY_SERVICE_ORDER = new NrcRequestMethod("NrcFindByServiceOrder");
  /** Variable representing the NrcFindWithExtendedData method */
  public static final NrcRequestMethod NRC_FIND_WITH_EXTENDED_DATA = new NrcRequestMethod("NrcFindWithExtendedData");
  /** Variable representing the NrcGet method */
  public static final NrcRequestMethod NRC_GET = new NrcRequestMethod("NrcGet");
  /** Variable representing the NrcNoBackoutFind method */
  public static final NrcRequestMethod NRC_NO_BACKOUT_FIND = new NrcRequestMethod("NrcNoBackoutFind");
  /** Variable representing the NrcRefinanceCreate method */
  public static final NrcRequestMethod NRC_REFINANCE_CREATE = new NrcRequestMethod("NrcRefinanceCreate");
  /** Variable representing the NrcUnbilledInstallmentFind method */
  public static final NrcRequestMethod NRC_UNBILLED_INSTALLMENT_FIND = new NrcRequestMethod("NrcUnbilledInstallmentFind");
  /** Variable representing the NrcUpdate method */
  public static final NrcRequestMethod NRC_UPDATE = new NrcRequestMethod("NrcUpdate");
  /** Variable representing the NrcUpdateValidate method */
  public static final NrcRequestMethod NRC_UPDATE_VALIDATE = new NrcRequestMethod("NrcUpdateValidate");
}
