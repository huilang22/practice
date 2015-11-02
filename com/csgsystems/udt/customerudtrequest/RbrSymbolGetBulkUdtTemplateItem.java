/*
 * Generated code DO NOT EDIT
 * Generated file: RbrSymbolGetBulkUdtTemplateItem.java
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
 * Class used to create a RbrSymbolGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrSymbolGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrSymbolObjectKeyData RbrSymbolGetIn;
/**
 *
 * Constructor to create a  RbrSymbolGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrSymbolGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrSymbolObjectKeyData RbrSymbolGetInIn) {
    super(id, context, "RbrSymbolGet");
    RbrSymbolGetIn = RbrSymbolGetInIn;
  }

  public void translateToMap() {
    if (RbrSymbolGetIn != null) {
      RbrSymbolGetIn.resetFlags(true, true);
      addInput("RbrSymbol", RbrSymbolObjectKeyHelper.toMap(RbrSymbolGetIn, new HashMap(), "RbrSymbolObjectKeyData").get("RbrSymbolObjectKeyData"));
    }
  }


/**
 *
 * Sets the RbrSymbol
 * @param RbrSymbolGetInIn Value of the RbrSymbolGetIn
 *
 */

  public void setRbrSymbol(RbrSymbolObjectKeyData RbrSymbolGetInIn) {
    RbrSymbolGetIn = RbrSymbolGetInIn;
  }

  public void translateFromMap() {
    RbrSymbolGetIn = RbrSymbolObjectKeyHelper.fromMap(inputMap, "RbrSymbol");
  }

/**
 *
 * Gets the RbrSymbol
 * @return Value of the RbrSymbol
 *
 */

  public RbrSymbolObjectKeyData getRbrSymbol( ) {
    return RbrSymbolGetIn;
  }

}
