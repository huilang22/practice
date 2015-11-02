/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a MktCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class MktCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MCObjectFilter MCFindIn;
/**
 *
 * Constructor to create a  MktCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MktCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, MCObjectFilter MCFindInIn) {
    super(id, context, "MktCodeFind");
    MCFindIn = MCFindInIn;
  }

  public void translateToMap() {
    if (MCFindIn != null) {
      Integer index =  MCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MktCode", MCObjectHelper.toMap(MCFindIn, new HashMap(), "MktCode").get("MktCode"));
    }
  }


/**
 *
 * Sets the MktCode
 * @param MCFindInIn Value of the MCFindIn
 *
 */

  public void setMktCode(MCObjectFilter MCFindInIn) {
    MCFindIn = MCFindInIn;
  }

  public void translateFromMap() {
    MCFindIn = MCObjectHelper.fromMapFilter(inputMap, "MktCode");
  }

/**
 *
 * Gets the MktCode
 * @return Value of the MktCode
 *
 */

  public MCObjectFilter getMktCode( ) {
    return MCFindIn;
  }

}
