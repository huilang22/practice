/*
 * Generated code DO NOT EDIT
 * Generated file: EquipTypeCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EquipTypeCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipTypeCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ETGObjectData ETGUpdateIn;
/**
 *
 * Constructor to create a  EquipTypeCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipTypeCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ETGObjectData ETGUpdateInIn) {
    super(id, context, "EquipTypeCodeUpdate");
    ETGUpdateIn = ETGUpdateInIn;
  }

  public void translateToMap() {
    if (ETGUpdateIn != null) {
      ETGUpdateIn.resetFlags(true, true);
      addInput("EquipTypeCode", ETGObjectHelper.toMap(ETGUpdateIn, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }


/**
 *
 * Sets the EquipTypeCode
 * @param ETGUpdateInIn Value of the ETGUpdateIn
 *
 */

  public void setEquipTypeCode(ETGObjectData ETGUpdateInIn) {
    ETGUpdateIn = ETGUpdateInIn;
  }

  public void translateFromMap() {
    ETGUpdateIn = ETGObjectHelper.fromMap(inputMap, "EquipTypeCode");
  }

/**
 *
 * Gets the EquipTypeCode
 * @return Value of the EquipTypeCode
 *
 */

  public ETGObjectData getEquipTypeCode( ) {
    return ETGUpdateIn;
  }

}
