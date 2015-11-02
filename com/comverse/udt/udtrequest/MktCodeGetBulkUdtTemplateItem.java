/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a MktCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class MktCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MCObjectKeyData MCGetIn;
/**
 *
 * Constructor to create a  MktCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MktCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, MCObjectKeyData MCGetInIn) {
    super(id, context, "MktCodeGet");
    MCGetIn = MCGetInIn;
  }

  public void translateToMap() {
    if (MCGetIn != null) {
      MCGetIn.resetFlags(true, true);
      addInput("MktCode", MCObjectKeyHelper.toMap(MCGetIn, new HashMap(), "MCObjectKeyData").get("MCObjectKeyData"));
    }
  }


/**
 *
 * Sets the MktCode
 * @param MCGetInIn Value of the MCGetIn
 *
 */

  public void setMktCode(MCObjectKeyData MCGetInIn) {
    MCGetIn = MCGetInIn;
  }

  public void translateFromMap() {
    MCGetIn = MCObjectKeyHelper.fromMap(inputMap, "MktCode");
  }

/**
 *
 * Gets the MktCode
 * @return Value of the MktCode
 *
 */

  public MCObjectKeyData getMktCode( ) {
    return MCGetIn;
  }

}
