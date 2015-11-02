/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a EquipTypeCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipTypeCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ETGObjectKeyData ETGDeleteIn;
/**
 *
 * Constructor to create a  EquipTypeCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipTypeCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ETGObjectKeyData ETGDeleteInIn) {
    super(id, context, "EquipTypeCodeDelete");
    ETGDeleteIn = ETGDeleteInIn;
  }

  public void translateToMap() {
    if (ETGDeleteIn != null) {
      ETGDeleteIn.resetFlags(true, true);
      addInput("EquipTypeCode", ETGObjectKeyHelper.toMap(ETGDeleteIn, new HashMap(), "ETGObjectKeyData").get("ETGObjectKeyData"));
    }
  }


/**
 *
 * Sets the EquipTypeCode
 * @param ETGDeleteInIn Value of the ETGDeleteIn
 *
 */

  public void setEquipTypeCode(ETGObjectKeyData ETGDeleteInIn) {
    ETGDeleteIn = ETGDeleteInIn;
  }

  public void translateFromMap() {
    ETGDeleteIn = ETGObjectKeyHelper.fromMap(inputMap, "EquipTypeCode");
  }

/**
 *
 * Gets the EquipTypeCode
 * @return Value of the EquipTypeCode
 *
 */

  public ETGObjectKeyData getEquipTypeCode( ) {
    return ETGDeleteIn;
  }

}
