/*
 * Generated code DO NOT EDIT
 * Generated file: EquipClassCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a EquipClassCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipClassCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECCObjectKeyData ECCDeleteIn;
/**
 *
 * Constructor to create a  EquipClassCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipClassCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ECCObjectKeyData ECCDeleteInIn) {
    super(id, context, "EquipClassCodeDelete");
    ECCDeleteIn = ECCDeleteInIn;
  }

  public void translateToMap() {
    if (ECCDeleteIn != null) {
      ECCDeleteIn.resetFlags(true, true);
      addInput("EquipClassCode", ECCObjectKeyHelper.toMap(ECCDeleteIn, new HashMap(), "ECCObjectKeyData").get("ECCObjectKeyData"));
    }
  }


/**
 *
 * Sets the EquipClassCode
 * @param ECCDeleteInIn Value of the ECCDeleteIn
 *
 */

  public void setEquipClassCode(ECCObjectKeyData ECCDeleteInIn) {
    ECCDeleteIn = ECCDeleteInIn;
  }

  public void translateFromMap() {
    ECCDeleteIn = ECCObjectKeyHelper.fromMap(inputMap, "EquipClassCode");
  }

/**
 *
 * Gets the EquipClassCode
 * @return Value of the EquipClassCode
 *
 */

  public ECCObjectKeyData getEquipClassCode( ) {
    return ECCDeleteIn;
  }

}
