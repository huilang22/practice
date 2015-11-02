/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherStatusInfoFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a VoucherStatusInfoFindBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherStatusInfoFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VoucherStatusInfoObjectFilter VouFIn;
/**
 *
 * Constructor to create a  VoucherStatusInfoFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherStatusInfoFindBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherStatusInfoObjectFilter VouFInIn) {
    super(id, context, "VoucherStatusInfoFind");
    VouFIn = VouFInIn;
  }

  public void translateToMap() {
    if (VouFIn != null) {
      Integer index =  VouFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouFIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }


/**
 *
 * Sets the VoucherStatusInfo
 * @param VouFInIn Value of the VouFIn
 *
 */

  public void setVoucherStatusInfo(VoucherStatusInfoObjectFilter VouFInIn) {
    VouFIn = VouFInIn;
  }

  public void translateFromMap() {
    VouFIn = VoucherStatusInfoObjectHelper.fromMapFilter(inputMap, "VoucherStatusInfo");
  }

/**
 *
 * Gets the VoucherStatusInfo
 * @return Value of the VoucherStatusInfo
 *
 */

  public VoucherStatusInfoObjectFilter getVoucherStatusInfo( ) {
    return VouFIn;
  }

}
