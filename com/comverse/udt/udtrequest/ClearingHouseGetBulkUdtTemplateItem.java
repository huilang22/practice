/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ClearingHouseGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ClearingHouseGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ClearingHouseObjectKeyData CHIGetIn;
/**
 *
 * Constructor to create a  ClearingHouseGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClearingHouseGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseObjectKeyData CHIGetInIn) {
    super(id, context, "ClearingHouseGet");
    CHIGetIn = CHIGetInIn;
  }

  public void translateToMap() {
    if (CHIGetIn != null) {
      CHIGetIn.resetFlags(true, true);
      addInput("ClearingHouse", ClearingHouseObjectKeyHelper.toMap(CHIGetIn, new HashMap(), "ClearingHouseObjectKeyData").get("ClearingHouseObjectKeyData"));
    }
  }


/**
 *
 * Sets the ClearingHouse
 * @param CHIGetInIn Value of the CHIGetIn
 *
 */

  public void setClearingHouse(ClearingHouseObjectKeyData CHIGetInIn) {
    CHIGetIn = CHIGetInIn;
  }

  public void translateFromMap() {
    CHIGetIn = ClearingHouseObjectKeyHelper.fromMap(inputMap, "ClearingHouse");
  }

/**
 *
 * Gets the ClearingHouse
 * @return Value of the ClearingHouse
 *
 */

  public ClearingHouseObjectKeyData getClearingHouse( ) {
    return CHIGetIn;
  }

}
