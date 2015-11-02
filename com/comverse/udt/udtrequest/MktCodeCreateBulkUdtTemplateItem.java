/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a MktCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class MktCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MCObjectData MCCreateIn;
/**
 *
 * Constructor to create a  MktCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MktCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, MCObjectData MCCreateInIn) {
    super(id, context, "MktCodeCreate");
    MCCreateIn = MCCreateInIn;
  }

  public void translateToMap() {
    if (MCCreateIn != null) {
      MCCreateIn.resetFlags(true, true);
      addInput("MktCode", MCObjectHelper.toMap(MCCreateIn, new HashMap(), "MktCode").get("MktCode"));
    }
  }


/**
 *
 * Sets the MktCode
 * @param MCCreateInIn Value of the MCCreateIn
 *
 */

  public void setMktCode(MCObjectData MCCreateInIn) {
    MCCreateIn = MCCreateInIn;
  }

  public void translateFromMap() {
    MCCreateIn = MCObjectHelper.fromMap(inputMap, "MktCode");
  }

/**
 *
 * Gets the MktCode
 * @return Value of the MktCode
 *
 */

  public MCObjectData getMktCode( ) {
    return MCCreateIn;
  }

}
