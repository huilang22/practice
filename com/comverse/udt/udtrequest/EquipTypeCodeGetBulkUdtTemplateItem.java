/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a EquipTypeCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipTypeCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ETGObjectKeyData ETGGetIn;
/**
 *
 * Constructor to create a  EquipTypeCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipTypeCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ETGObjectKeyData ETGGetInIn) {
    super(id, context, "EquipTypeCodeGet");
    ETGGetIn = ETGGetInIn;
  }

  public void translateToMap() {
    if (ETGGetIn != null) {
      ETGGetIn.resetFlags(true, true);
      addInput("EquipTypeCode", ETGObjectKeyHelper.toMap(ETGGetIn, new HashMap(), "ETGObjectKeyData").get("ETGObjectKeyData"));
    }
  }


/**
 *
 * Sets the EquipTypeCode
 * @param ETGGetInIn Value of the ETGGetIn
 *
 */

  public void setEquipTypeCode(ETGObjectKeyData ETGGetInIn) {
    ETGGetIn = ETGGetInIn;
  }

  public void translateFromMap() {
    ETGGetIn = ETGObjectKeyHelper.fromMap(inputMap, "EquipTypeCode");
  }

/**
 *
 * Gets the EquipTypeCode
 * @return Value of the EquipTypeCode
 *
 */

  public ETGObjectKeyData getEquipTypeCode( ) {
    return ETGGetIn;
  }

}
