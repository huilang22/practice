/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a MktCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class MktCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MCObjectKeyData MCDeleteIn;
/**
 *
 * Constructor to create a  MktCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MktCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, MCObjectKeyData MCDeleteInIn) {
    super(id, context, "MktCodeDelete");
    MCDeleteIn = MCDeleteInIn;
  }

  public void translateToMap() {
    if (MCDeleteIn != null) {
      MCDeleteIn.resetFlags(true, true);
      addInput("MktCode", MCObjectKeyHelper.toMap(MCDeleteIn, new HashMap(), "MCObjectKeyData").get("MCObjectKeyData"));
    }
  }


/**
 *
 * Sets the MktCode
 * @param MCDeleteInIn Value of the MCDeleteIn
 *
 */

  public void setMktCode(MCObjectKeyData MCDeleteInIn) {
    MCDeleteIn = MCDeleteInIn;
  }

  public void translateFromMap() {
    MCDeleteIn = MCObjectKeyHelper.fromMap(inputMap, "MktCode");
  }

/**
 *
 * Gets the MktCode
 * @return Value of the MktCode
 *
 */

  public MCObjectKeyData getMktCode( ) {
    return MCDeleteIn;
  }

}
