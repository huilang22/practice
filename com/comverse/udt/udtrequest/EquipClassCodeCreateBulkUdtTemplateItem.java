/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeCreateBulkUdtTemplateItem.java
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
