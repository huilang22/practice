/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolCreateBulkUdtTemplateItem.java
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
 * Class used to create a RbrSymbolCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrSymbolCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrSymbolObjectData RbrSymbolCreateIn;
/**
 *
 * Constructor to create a  RbrSymbolCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrSymbolCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrSymbolObjectData RbrSymbolCreateInIn) {
    super(id, context, "RbrSymbolCreate");
    RbrSymbolCreateIn = RbrSymbolCreateInIn;
  }

  public void translateToMap() {
    if (RbrSymbolCreateIn != null) {
      RbrSymbolCreateIn.resetFlags(true, true);
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(RbrSymbolCreateIn, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }


/**
 *
 * Sets the RbrSymbol
 * @param RbrSymbolCreateInIn Value of the RbrSymbolCreateIn
 *
 */

  public void setRbrSymbol(RbrSymbolObjectData RbrSymbolCreateInIn) {
    RbrSymbolCreateIn = RbrSymbolCreateInIn;
  }

  public void translateFromMap() {
    RbrSymbolCreateIn = RbrSymbolObjectHelper.fromMap(inputMap, "RbrSymbol");
  }

/**
 *
 * Gets the RbrSymbol
 * @return Value of the RbrSymbol
 *
 */

  public RbrSymbolObjectData getRbrSymbol( ) {
    return RbrSymbolCreateIn;
  }

}
