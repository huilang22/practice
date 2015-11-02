/*
 * Generated code DO NOT EDIT
 * Generated file: EquipClassCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EquipClassCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipClassCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECCObjectData ECCUpdateIn;
/**
 *
 * Constructor to create a  EquipClassCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipClassCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ECCObjectData ECCUpdateInIn) {
    super(id, context, "EquipClassCodeUpdate");
    ECCUpdateIn = ECCUpdateInIn;
  }

  public void translateToMap() {
    if (ECCUpdateIn != null) {
      ECCUpdateIn.resetFlags(true, true);
      addInput("EquipClassCode", ECCObjectHelper.toMap(ECCUpdateIn, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }


/**
 *
 * Sets the EquipClassCode
 * @param ECCUpdateInIn Value of the ECCUpdateIn
 *
 */

  public void setEquipClassCode(ECCObjectData ECCUpdateInIn) {
    ECCUpdateIn = ECCUpdateInIn;
  }

  public void translateFromMap() {
    ECCUpdateIn = ECCObjectHelper.fromMap(inputMap, "EquipClassCode");
  }

/**
 *
 * Gets the EquipClassCode
 * @return Value of the EquipClassCode
 *
 */

  public ECCObjectData getEquipClassCode( ) {
    return ECCUpdateIn;
  }

}
