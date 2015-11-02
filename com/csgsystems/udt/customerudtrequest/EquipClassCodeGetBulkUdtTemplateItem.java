/*
 * Generated code DO NOT EDIT
 * Generated file: EquipClassCodeGetBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a EquipClassCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipClassCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECCObjectKeyData ECCGetIn;
/**
 *
 * Constructor to create a  EquipClassCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipClassCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ECCObjectKeyData ECCGetInIn) {
    super(id, context, "EquipClassCodeGet");
    ECCGetIn = ECCGetInIn;
  }

  public void translateToMap() {
    if (ECCGetIn != null) {
      ECCGetIn.resetFlags(true, true);
      addInput("EquipClassCode", ECCObjectKeyHelper.toMap(ECCGetIn, new HashMap(), "ECCObjectKeyData").get("ECCObjectKeyData"));
    }
  }


/**
 *
 * Sets the EquipClassCode
 * @param ECCGetInIn Value of the ECCGetIn
 *
 */

  public void setEquipClassCode(ECCObjectKeyData ECCGetInIn) {
    ECCGetIn = ECCGetInIn;
  }

  public void translateFromMap() {
    ECCGetIn = ECCObjectKeyHelper.fromMap(inputMap, "EquipClassCode");
  }

/**
 *
 * Gets the EquipClassCode
 * @return Value of the EquipClassCode
 *
 */

  public ECCObjectKeyData getEquipClassCode( ) {
    return ECCGetIn;
  }

}
