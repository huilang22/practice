/*
 * Generated code DO NOT EDIT
 * Generated file: PpvRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class PpvRequestMethod implements UdtMethod {
  private String method = null;
  private PpvRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the CtcScheduleFindEligible method */
  public static final PpvRequestMethod CTC_SCHEDULE_FIND_ELIGIBLE = new PpvRequestMethod("CtcScheduleFindEligible");
  /** Variable representing the PpvAccountQdeCheck method */
  public static final PpvRequestMethod PPV_ACCOUNT_QDE_CHECK = new PpvRequestMethod("PpvAccountQdeCheck");
  /** Variable representing the PpvOfferValidate method */
  public static final PpvRequestMethod PPV_OFFER_VALIDATE = new PpvRequestMethod("PpvOfferValidate");
  /** Variable representing the PpvOrderItemAssemble method */
  public static final PpvRequestMethod PPV_ORDER_ITEM_ASSEMBLE = new PpvRequestMethod("PpvOrderItemAssemble");
  /** Variable representing the PpvOutletFindByAccount method */
  public static final PpvRequestMethod PPV_OUTLET_FIND_BY_ACCOUNT = new PpvRequestMethod("PpvOutletFindByAccount");
  /** Variable representing the PpvOutletFindByService method */
  public static final PpvRequestMethod PPV_OUTLET_FIND_BY_SERVICE = new PpvRequestMethod("PpvOutletFindByService");
  /** Variable representing the PpvReferenceDataGet method */
  public static final PpvRequestMethod PPV_REFERENCE_DATA_GET = new PpvRequestMethod("PpvReferenceDataGet");
}
