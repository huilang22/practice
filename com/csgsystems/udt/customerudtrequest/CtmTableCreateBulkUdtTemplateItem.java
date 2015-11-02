/*
 * Generated code DO NOT EDIT
 * Generated file: CtmTableCreateBulkUdtTemplateItem.java
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
 * Class used to create a CtmTableCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtmTableCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtmTableObjectData CtmTableCreateIn;
/**
 *
 * Constructor to create a  CtmTableCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtmTableCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmTableObjectData CtmTableCreateInIn) {
    super(id, context, "CtmTableCreate");
    CtmTableCreateIn = CtmTableCreateInIn;
  }

  public void translateToMap() {
    if (CtmTableCreateIn != null) {
      CtmTableCreateIn.resetFlags(true, true);
      addInput("CtmTable", CtmTableObjectHelper.toMap(CtmTableCreateIn, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }


/**
 *
 * Sets the CtmTable
 * @param CtmTableCreateInIn Value of the CtmTableCreateIn
 *
 */

  public void setCtmTable(CtmTableObjectData CtmTableCreateInIn) {
    CtmTableCreateIn = CtmTableCreateInIn;
  }

  public void translateFromMap() {
    CtmTableCreateIn = CtmTableObjectHelper.fromMap(inputMap, "CtmTable");
  }

/**
 *
 * Gets the CtmTable
 * @return Value of the CtmTable
 *
 */

  public CtmTableObjectData getCtmTable( ) {
    return CtmTableCreateIn;
  }

}
