/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataLocateFindBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataLocateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataLocateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExtendedDataLocateObjectFilter elfIn;
/**
 *
 * Constructor to create a  ExtendedDataLocateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataLocateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ExtendedDataLocateObjectFilter elfInIn) {
    super(id, context, "ExtendedDataLocateFind");
    elfIn = elfInIn;
  }

  public void translateToMap() {
    if (elfIn != null) {
      Integer index =  elfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(elfIn, new HashMap(), "ExtendedDataLocate").get("ExtendedDataLocate"));
    }
  }


/**
 *
 * Sets the ExtendedDataLocate
 * @param elfInIn Value of the elfIn
 *
 */

  public void setExtendedDataLocate(ExtendedDataLocateObjectFilter elfInIn) {
    elfIn = elfInIn;
  }

  public void translateFromMap() {
    elfIn = ExtendedDataLocateObjectHelper.fromMapFilter(inputMap, "ExtendedDataLocate");
  }

/**
 *
 * Gets the ExtendedDataLocate
 * @return Value of the ExtendedDataLocate
 *
 */

  public ExtendedDataLocateObjectFilter getExtendedDataLocate( ) {
    return elfIn;
  }

}
