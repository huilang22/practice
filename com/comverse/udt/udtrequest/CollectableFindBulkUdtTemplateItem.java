/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectableFindBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * Class used to create a CollectableFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CollectableFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CollectableObjectFilter findIn;
/**
 *
 * Constructor to create a  CollectableFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CollectableFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CollectableObjectFilter findInIn) {
    super(id, context, "CollectableFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Collectable", CollectableObjectHelper.toMap(findIn, new HashMap(), "Collectable").get("Collectable"));
    }
  }


/**
 *
 * Sets the Collectable
 * @param findInIn Value of the findIn
 *
 */

  public void setCollectable(CollectableObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = CollectableObjectHelper.fromMapFilter(inputMap, "Collectable");
  }

/**
 *
 * Gets the Collectable
 * @return Value of the Collectable
 *
 */

  public CollectableObjectFilter getCollectable( ) {
    return findIn;
  }

}
