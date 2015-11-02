/*
 * Generated code DO NOT EDIT
 * Generated file: CitInteractionFindBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * Class used to create a CitInteractionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CitInteractionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitInteractionObjectFilter citInteractionFindIn;
/**
 *
 * Constructor to create a  CitInteractionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitInteractionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CitInteractionObjectFilter citInteractionFindInIn) {
    super(id, context, "CitInteractionFind");
    citInteractionFindIn = citInteractionFindInIn;
  }

  public void translateToMap() {
    if (citInteractionFindIn != null) {
      Integer index =  citInteractionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(citInteractionFindIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }


/**
 *
 * Sets the CitInteraction
 * @param citInteractionFindInIn Value of the citInteractionFindIn
 *
 */

  public void setCitInteraction(CitInteractionObjectFilter citInteractionFindInIn) {
    citInteractionFindIn = citInteractionFindInIn;
  }

  public void translateFromMap() {
    citInteractionFindIn = CitInteractionObjectHelper.fromMapFilter(inputMap, "CitInteraction");
  }

/**
 *
 * Gets the CitInteraction
 * @return Value of the CitInteraction
 *
 */

  public CitInteractionObjectFilter getCitInteraction( ) {
    return citInteractionFindIn;
  }

}
