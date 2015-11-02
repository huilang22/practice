/*
 * Generated code DO NOT EDIT
 * Generated file: RbrSymbolUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RbrSymbolUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrSymbolUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrSymbolObjectData RbrSymbolUpdateIn;
/**
 *
 * Constructor to create a  RbrSymbolUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrSymbolUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrSymbolObjectData RbrSymbolUpdateInIn) {
    super(id, context, "RbrSymbolUpdate");
    RbrSymbolUpdateIn = RbrSymbolUpdateInIn;
  }

  public void translateToMap() {
    if (RbrSymbolUpdateIn != null) {
      RbrSymbolUpdateIn.resetFlags(true, true);
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(RbrSymbolUpdateIn, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }


/**
 *
 * Sets the RbrSymbol
 * @param RbrSymbolUpdateInIn Value of the RbrSymbolUpdateIn
 *
 */

  public void setRbrSymbol(RbrSymbolObjectData RbrSymbolUpdateInIn) {
    RbrSymbolUpdateIn = RbrSymbolUpdateInIn;
  }

  public void translateFromMap() {
    RbrSymbolUpdateIn = RbrSymbolObjectHelper.fromMap(inputMap, "RbrSymbol");
  }

/**
 *
 * Gets the RbrSymbol
 * @return Value of the RbrSymbol
 *
 */

  public RbrSymbolObjectData getRbrSymbol( ) {
    return RbrSymbolUpdateIn;
  }

}
