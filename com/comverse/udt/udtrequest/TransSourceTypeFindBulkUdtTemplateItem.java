/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a TransSourceTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class TransSourceTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected TransSourceTypeObjectFilter TSFindIn;
/**
 *
 * Constructor to create a  TransSourceTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public TransSourceTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, TransSourceTypeObjectFilter TSFindInIn) {
    super(id, context, "TransSourceTypeFind");
    TSFindIn = TSFindInIn;
  }

  public void translateToMap() {
    if (TSFindIn != null) {
      Integer index =  TSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(TSFindIn, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }


/**
 *
 * Sets the TransSourceType
 * @param TSFindInIn Value of the TSFindIn
 *
 */

  public void setTransSourceType(TransSourceTypeObjectFilter TSFindInIn) {
    TSFindIn = TSFindInIn;
  }

  public void translateFromMap() {
    TSFindIn = TransSourceTypeObjectHelper.fromMapFilter(inputMap, "TransSourceType");
  }

/**
 *
 * Gets the TransSourceType
 * @return Value of the TransSourceType
 *
 */

  public TransSourceTypeObjectFilter getTransSourceType( ) {
    return TSFindIn;
  }

}
