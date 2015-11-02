/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ClearingHouseDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ClearingHouseDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ClearingHouseObjectKeyData CHIDeleteIn;
/**
 *
 * Constructor to create a  ClearingHouseDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClearingHouseDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseObjectKeyData CHIDeleteInIn) {
    super(id, context, "ClearingHouseDelete");
    CHIDeleteIn = CHIDeleteInIn;
  }

  public void translateToMap() {
    if (CHIDeleteIn != null) {
      CHIDeleteIn.resetFlags(true, true);
      addInput("ClearingHouse", ClearingHouseObjectKeyHelper.toMap(CHIDeleteIn, new HashMap(), "ClearingHouseObjectKeyData").get("ClearingHouseObjectKeyData"));
    }
  }


/**
 *
 * Sets the ClearingHouse
 * @param CHIDeleteInIn Value of the CHIDeleteIn
 *
 */

  public void setClearingHouse(ClearingHouseObjectKeyData CHIDeleteInIn) {
    CHIDeleteIn = CHIDeleteInIn;
  }

  public void translateFromMap() {
    CHIDeleteIn = ClearingHouseObjectKeyHelper.fromMap(inputMap, "ClearingHouse");
  }

/**
 *
 * Gets the ClearingHouse
 * @return Value of the ClearingHouse
 *
 */

  public ClearingHouseObjectKeyData getClearingHouse( ) {
    return CHIDeleteIn;
  }

}
