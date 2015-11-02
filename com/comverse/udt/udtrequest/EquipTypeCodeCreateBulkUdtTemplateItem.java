/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a EquipTypeCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipTypeCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ETGObjectData ETGCreateIn;
/**
 *
 * Constructor to create a  EquipTypeCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipTypeCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ETGObjectData ETGCreateInIn) {
    super(id, context, "EquipTypeCodeCreate");
    ETGCreateIn = ETGCreateInIn;
  }

  public void translateToMap() {
    if (ETGCreateIn != null) {
      ETGCreateIn.resetFlags(true, true);
      addInput("EquipTypeCode", ETGObjectHelper.toMap(ETGCreateIn, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }


/**
 *
 * Sets the EquipTypeCode
 * @param ETGCreateInIn Value of the ETGCreateIn
 *
 */

  public void setEquipTypeCode(ETGObjectData ETGCreateInIn) {
    ETGCreateIn = ETGCreateInIn;
  }

  public void translateFromMap() {
    ETGCreateIn = ETGObjectHelper.fromMap(inputMap, "EquipTypeCode");
  }

/**
 *
 * Gets the EquipTypeCode
 * @return Value of the EquipTypeCode
 *
 */

  public ETGObjectData getEquipTypeCode( ) {
    return ETGCreateIn;
  }

}
