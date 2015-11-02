/*
 * Generated code DO NOT EDIT
 * Generated file: CtmTableFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a CtmTableFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmTableFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmTableObjectFilter CtmTableFindIn;
/**
 *
 * Constructor to create a  CtmTableFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmTableFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmTableObjectFilter CtmTableFindInIn) {
    super(id, context, "CtmTableFind");
    CtmTableFindIn = CtmTableFindInIn;
  }

  public void translateToMap() {
    if (CtmTableFindIn != null) {
      Integer index =  CtmTableFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtmTable", CtmTableObjectHelper.toMap(CtmTableFindIn, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }


/**
 *
 * Sets the CtmTable
 * @param CtmTableFindInIn Value of the CtmTableFindIn
 *
 */

  public void setCtmTable(CtmTableObjectFilter CtmTableFindInIn) {
    CtmTableFindIn = CtmTableFindInIn;
  }

  public void translateFromMap() {
    CtmTableFindIn = CtmTableObjectHelper.fromMapFilter(inputMap, "CtmTable");
  }

/**
 *
 * Gets the CtmTable
 * @return Value of the CtmTable
 *
 */

  public CtmTableObjectFilter getCtmTable( ) {
    return CtmTableFindIn;
  }

}
