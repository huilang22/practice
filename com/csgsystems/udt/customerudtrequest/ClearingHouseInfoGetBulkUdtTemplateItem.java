/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseInfoGetBulkUdtTemplateItem.java
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
 * Class used to create a ClearingHouseInfoGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ClearingHouseInfoGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ClearingHouseInfoObjectKeyData CHIGetIn;
/**
 *
 * Constructor to create a  ClearingHouseInfoGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClearingHouseInfoGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseInfoObjectKeyData CHIGetInIn) {
    super(id, context, "ClearingHouseInfoGet");
    CHIGetIn = CHIGetInIn;
  }

  public void translateToMap() {
    if (CHIGetIn != null) {
      CHIGetIn.resetFlags(true, true);
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectKeyHelper.toMap(CHIGetIn, new HashMap(), "ClearingHouseInfoObjectKeyData").get("ClearingHouseInfoObjectKeyData"));
    }
  }


/**
 *
 * Sets the ClearingHouseInfo
 * @param CHIGetInIn Value of the CHIGetIn
 *
 */

  public void setClearingHouseInfo(ClearingHouseInfoObjectKeyData CHIGetInIn) {
    CHIGetIn = CHIGetInIn;
  }

  public void translateFromMap() {
    CHIGetIn = ClearingHouseInfoObjectKeyHelper.fromMap(inputMap, "ClearingHouseInfo");
  }

/**
 *
 * Gets the ClearingHouseInfo
 * @return Value of the ClearingHouseInfo
 *
 */

  public ClearingHouseInfoObjectKeyData getClearingHouseInfo( ) {
    return CHIGetIn;
  }

}
