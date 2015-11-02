/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeCreateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a TransSourceTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class TransSourceTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransSourceTypeObjectData TSCreateIn;
/**
 *
 * Constructor to create a  TransSourceTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransSourceTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, TransSourceTypeObjectData TSCreateInIn) {
    super(id, context, "TransSourceTypeCreate");
    TSCreateIn = TSCreateInIn;
  }

  public void translateToMap() {
    if (TSCreateIn != null) {
      TSCreateIn.resetFlags(true, true);
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(TSCreateIn, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }


/**
 *
 * Sets the TransSourceType
 * @param TSCreateInIn Value of the TSCreateIn
 *
 */

  public void setTransSourceType(TransSourceTypeObjectData TSCreateInIn) {
    TSCreateIn = TSCreateInIn;
  }

  public void translateFromMap() {
    TSCreateIn = TransSourceTypeObjectHelper.fromMap(inputMap, "TransSourceType");
  }

/**
 *
 * Gets the TransSourceType
 * @return Value of the TransSourceType
 *
 */

  public TransSourceTypeObjectData getTransSourceType( ) {
    return TSCreateIn;
  }

}
