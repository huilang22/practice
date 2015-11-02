/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupMapFindBulkUdtTemplateItem.java
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
 * Class used to create a BillMessageGroupMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BillMessageGroupMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BillMessageGroupMapObjectFilter BMGFindIn;
/**
 *
 * Constructor to create a  BillMessageGroupMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BillMessageGroupMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupMapObjectFilter BMGFindInIn) {
    super(id, context, "BillMessageGroupMapFind");
    BMGFindIn = BMGFindInIn;
  }

  public void translateToMap() {
    if (BMGFindIn != null) {
      Integer index =  BMGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BillMessageGroupMap", BillMessageGroupMapObjectHelper.toMap(BMGFindIn, new HashMap(), "BillMessageGroupMap").get("BillMessageGroupMap"));
    }
  }


/**
 *
 * Sets the BillMessageGroupMap
 * @param BMGFindInIn Value of the BMGFindIn
 *
 */

  public void setBillMessageGroupMap(BillMessageGroupMapObjectFilter BMGFindInIn) {
    BMGFindIn = BMGFindInIn;
  }

  public void translateFromMap() {
    BMGFindIn = BillMessageGroupMapObjectHelper.fromMapFilter(inputMap, "BillMessageGroupMap");
  }

/**
 *
 * Gets the BillMessageGroupMap
 * @return Value of the BillMessageGroupMap
 *
 */

  public BillMessageGroupMapObjectFilter getBillMessageGroupMap( ) {
    return BMGFindIn;
  }

}
