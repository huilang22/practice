/*
 * Generated code DO NOT EDIT
 * Generated file: EquipClassCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a EquipClassCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipClassCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECCObjectData ECCCreateIn;
/**
 *
 * Constructor to create a  EquipClassCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipClassCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ECCObjectData ECCCreateInIn) {
    super(id, context, "EquipClassCodeCreate");
    ECCCreateIn = ECCCreateInIn;
  }

  public void translateToMap() {
    if (ECCCreateIn != null) {
      ECCCreateIn.resetFlags(true, true);
      addInput("EquipClassCode", ECCObjectHelper.toMap(ECCCreateIn, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }


/**
 *
 * Sets the EquipClassCode
 * @param ECCCreateInIn Value of the ECCCreateIn
 *
 */

  public void setEquipClassCode(ECCObjectData ECCCreateInIn) {
    ECCCreateIn = ECCCreateInIn;
  }

  public void translateFromMap() {
    ECCCreateIn = ECCObjectHelper.fromMap(inputMap, "EquipClassCode");
  }

/**
 *
 * Gets the EquipClassCode
 * @return Value of the EquipClassCode
 *
 */

  public ECCObjectData getEquipClassCode( ) {
    return ECCCreateIn;
  }

}
