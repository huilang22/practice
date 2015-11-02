/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataLocateDeleteListBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ExtendedDataLocateDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataLocateDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExtendedDataLocateObjectFilter elxlistIn;
/**
 *
 * Constructor to create a  ExtendedDataLocateDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataLocateDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataLocateObjectFilter elxlistInIn) {
    super(id, context, "ExtendedDataLocateDeleteList");
    elxlistIn = elxlistInIn;
  }

  public void translateToMap() {
    if (elxlistIn != null) {
      Integer index =  elxlistIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(elxlistIn, new HashMap(), "ExtendedDataLocate").get("ExtendedDataLocate"));
    }
  }


/**
 *
 * Sets the ExtendedDataLocate
 * @param elxlistInIn Value of the elxlistIn
 *
 */

  public void setExtendedDataLocate(ExtendedDataLocateObjectFilter elxlistInIn) {
    elxlistIn = elxlistInIn;
  }

  public void translateFromMap() {
    elxlistIn = ExtendedDataLocateObjectHelper.fromMapFilter(inputMap, "ExtendedDataLocate");
  }

/**
 *
 * Gets the ExtendedDataLocate
 * @return Value of the ExtendedDataLocate
 *
 */

  public ExtendedDataLocateObjectFilter getExtendedDataLocate( ) {
    return elxlistIn;
  }

}
