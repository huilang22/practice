/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a MktCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class MktCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MCObjectData MCUpdateIn;
/**
 *
 * Constructor to create a  MktCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MktCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, MCObjectData MCUpdateInIn) {
    super(id, context, "MktCodeUpdate");
    MCUpdateIn = MCUpdateInIn;
  }

  public void translateToMap() {
    if (MCUpdateIn != null) {
      MCUpdateIn.resetFlags(true, true);
      addInput("MktCode", MCObjectHelper.toMap(MCUpdateIn, new HashMap(), "MktCode").get("MktCode"));
    }
  }


/**
 *
 * Sets the MktCode
 * @param MCUpdateInIn Value of the MCUpdateIn
 *
 */

  public void setMktCode(MCObjectData MCUpdateInIn) {
    MCUpdateIn = MCUpdateInIn;
  }

  public void translateFromMap() {
    MCUpdateIn = MCObjectHelper.fromMap(inputMap, "MktCode");
  }

/**
 *
 * Gets the MktCode
 * @return Value of the MktCode
 *
 */

  public MCObjectData getMktCode( ) {
    return MCUpdateIn;
  }

}
