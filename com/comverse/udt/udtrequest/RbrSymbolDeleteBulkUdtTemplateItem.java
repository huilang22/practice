/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RbrSymbolDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrSymbolDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrSymbolObjectKeyData RbrSymbolDeleteIn;
/**
 *
 * Constructor to create a  RbrSymbolDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrSymbolDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrSymbolObjectKeyData RbrSymbolDeleteInIn) {
    super(id, context, "RbrSymbolDelete");
    RbrSymbolDeleteIn = RbrSymbolDeleteInIn;
  }

  public void translateToMap() {
    if (RbrSymbolDeleteIn != null) {
      RbrSymbolDeleteIn.resetFlags(true, true);
      addInput("RbrSymbol", RbrSymbolObjectKeyHelper.toMap(RbrSymbolDeleteIn, new HashMap(), "RbrSymbolObjectKeyData").get("RbrSymbolObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrSymbol
 * @param RbrSymbolDeleteInIn Value of the RbrSymbolDeleteIn
 *
 */

  public void setRbrSymbol(RbrSymbolObjectKeyData RbrSymbolDeleteInIn) {
    RbrSymbolDeleteIn = RbrSymbolDeleteInIn;
  }

  public void translateFromMap() {
    RbrSymbolDeleteIn = RbrSymbolObjectKeyHelper.fromMap(inputMap, "RbrSymbol");
  }

/**
 *
 * Gets the RbrSymbol
 * @return Value of the RbrSymbol
 *
 */

  public RbrSymbolObjectKeyData getRbrSymbol( ) {
    return RbrSymbolDeleteIn;
  }

}
