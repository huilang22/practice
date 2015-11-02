/*
 * Generated code DO NOT EDIT
 * Generated file: CitInteractionNoteFindBulkUdtTemplateItem.java
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
 * Class used to create a CitInteractionNoteFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CitInteractionNoteFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CitInteractionNoteObjectFilter citInteractionNoteFindIn;
/**
 *
 * Constructor to create a  CitInteractionNoteFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CitInteractionNoteFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CitInteractionNoteObjectFilter citInteractionNoteFindInIn) {
    super(id, context, "CitInteractionNoteFind");
    citInteractionNoteFindIn = citInteractionNoteFindInIn;
  }

  public void translateToMap() {
    if (citInteractionNoteFindIn != null) {
      Integer index =  citInteractionNoteFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitInteraction", CitInteractionNoteObjectHelper.toMap(citInteractionNoteFindIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }


/**
 *
 * Sets the CitInteraction
 * @param citInteractionNoteFindInIn Value of the citInteractionNoteFindIn
 *
 */

  public void setCitInteraction(CitInteractionNoteObjectFilter citInteractionNoteFindInIn) {
    citInteractionNoteFindIn = citInteractionNoteFindInIn;
  }

  public void translateFromMap() {
    citInteractionNoteFindIn = CitInteractionNoteObjectHelper.fromMapFilter(inputMap, "CitInteraction");
  }

/**
 *
 * Gets the CitInteraction
 * @return Value of the CitInteraction
 *
 */

  public CitInteractionNoteObjectFilter getCitInteraction( ) {
    return citInteractionNoteFindIn;
  }

}
