/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolFindBulkUdtTemplateItem.java
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
 * Class used to create a RbrSymbolFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RbrSymbolFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RbrSymbolObjectFilter RbrSymbolFindIn;
/**
 *
 * Constructor to create a  RbrSymbolFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RbrSymbolFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrSymbolObjectFilter RbrSymbolFindInIn) {
    super(id, context, "RbrSymbolFind");
    RbrSymbolFindIn = RbrSymbolFindInIn;
  }

  public void translateToMap() {
    if (RbrSymbolFindIn != null) {
      Integer index =  RbrSymbolFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrSymbol", RbrSymbolObjectHelper.toMap(RbrSymbolFindIn, new HashMap(), "RbrSymbol").get("RbrSymbol"));
    }
  }


/**
 *
 * Sets the RbrSymbol
 * @param RbrSymbolFindInIn Value of the RbrSymbolFindIn
 *
 */

  public void setRbrSymbol(RbrSymbolObjectFilter RbrSymbolFindInIn) {
    RbrSymbolFindIn = RbrSymbolFindInIn;
  }

  public void translateFromMap() {
    RbrSymbolFindIn = RbrSymbolObjectHelper.fromMapFilter(inputMap, "RbrSymbol");
  }

/**
 *
 * Gets the RbrSymbol
 * @return Value of the RbrSymbol
 *
 */

  public RbrSymbolObjectFilter getRbrSymbol( ) {
    return RbrSymbolFindIn;
  }

}
