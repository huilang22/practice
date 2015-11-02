/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a TransSourceTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class TransSourceTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransSourceTypeObjectKeyData TSDeleteIn;
/**
 *
 * Constructor to create a  TransSourceTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransSourceTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, TransSourceTypeObjectKeyData TSDeleteInIn) {
    super(id, context, "TransSourceTypeDelete");
    TSDeleteIn = TSDeleteInIn;
  }

  public void translateToMap() {
    if (TSDeleteIn != null) {
      TSDeleteIn.resetFlags(true, true);
      addInput("TransSourceType", TransSourceTypeObjectKeyHelper.toMap(TSDeleteIn, new HashMap(), "TransSourceTypeObjectKeyData").get("TransSourceTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the TransSourceType
 * @param TSDeleteInIn Value of the TSDeleteIn
 *
 */

  public void setTransSourceType(TransSourceTypeObjectKeyData TSDeleteInIn) {
    TSDeleteIn = TSDeleteInIn;
  }

  public void translateFromMap() {
    TSDeleteIn = TransSourceTypeObjectKeyHelper.fromMap(inputMap, "TransSourceType");
  }

/**
 *
 * Gets the TransSourceType
 * @return Value of the TransSourceType
 *
 */

  public TransSourceTypeObjectKeyData getTransSourceType( ) {
    return TSDeleteIn;
  }

}
