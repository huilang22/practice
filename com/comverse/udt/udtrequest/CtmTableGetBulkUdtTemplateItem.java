/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableGetBulkUdtTemplateItem.java
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
 * Class used to create a CtmTableGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmTableGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmTableObjectKeyData CtmTableGetIn;
/**
 *
 * Constructor to create a  CtmTableGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmTableGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmTableObjectKeyData CtmTableGetInIn) {
    super(id, context, "CtmTableGet");
    CtmTableGetIn = CtmTableGetInIn;
  }

  public void translateToMap() {
    if (CtmTableGetIn != null) {
      CtmTableGetIn.resetFlags(true, true);
      addInput("CtmTable", CtmTableObjectKeyHelper.toMap(CtmTableGetIn, new HashMap(), "CtmTableObjectKeyData").get("CtmTableObjectKeyData"));
    }
  }


/**
 *
 * Sets the CtmTable
 * @param CtmTableGetInIn Value of the CtmTableGetIn
 *
 */

  public void setCtmTable(CtmTableObjectKeyData CtmTableGetInIn) {
    CtmTableGetIn = CtmTableGetInIn;
  }

  public void translateFromMap() {
    CtmTableGetIn = CtmTableObjectKeyHelper.fromMap(inputMap, "CtmTable");
  }

/**
 *
 * Gets the CtmTable
 * @return Value of the CtmTable
 *
 */

  public CtmTableObjectKeyData getCtmTable( ) {
    return CtmTableGetIn;
  }

}
