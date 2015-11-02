/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a VipCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class VipCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected VipCodeObjectKeyData VCDeleteIn;
/**
 *
 * Constructor to create a  VipCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VipCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, VipCodeObjectKeyData VCDeleteInIn) {
    super(id, context, "VipCodeDelete");
    VCDeleteIn = VCDeleteInIn;
  }

  public void translateToMap() {
    if (VCDeleteIn != null) {
      VCDeleteIn.resetFlags(true, true);
      addInput("VipCode", VipCodeObjectKeyHelper.toMap(VCDeleteIn, new HashMap(), "VipCodeObjectKeyData").get("VipCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the VipCode
 * @param VCDeleteInIn Value of the VCDeleteIn
 *
 */

  public void setVipCode(VipCodeObjectKeyData VCDeleteInIn) {
    VCDeleteIn = VCDeleteInIn;
  }

  public void translateFromMap() {
    VCDeleteIn = VipCodeObjectKeyHelper.fromMap(inputMap, "VipCode");
  }

/**
 *
 * Gets the VipCode
 * @return Value of the VipCode
 *
 */

  public VipCodeObjectKeyData getVipCode( ) {
    return VCDeleteIn;
  }

}
