/*
 * Generated code DO NOT EDIT
 * Generated file: CollectorFindBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * Class used to create a CollectorFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CollectorFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CollectorObjectFilter findIn;
/**
 *
 * Constructor to create a  CollectorFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CollectorFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CollectorObjectFilter findInIn) {
    super(id, context, "CollectorFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Collector", CollectorObjectHelper.toMap(findIn, new HashMap(), "Collector").get("Collector"));
    }
  }


/**
 *
 * Sets the Collector
 * @param findInIn Value of the findIn
 *
 */

  public void setCollector(CollectorObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = CollectorObjectHelper.fromMapFilter(inputMap, "Collector");
  }

/**
 *
 * Gets the Collector
 * @return Value of the Collector
 *
 */

  public CollectorObjectFilter getCollector( ) {
    return findIn;
  }

}
