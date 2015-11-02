/*
 * Generated code DO NOT EDIT
 * Generated file: EnhancedNoteFindBulkUdtTemplateItem.java
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
 * Class used to create a EnhancedNoteFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EnhancedNoteFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EnhancedNoteObjectFilter enhancedNoteFindIn;
/**
 *
 * Constructor to create a  EnhancedNoteFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EnhancedNoteFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EnhancedNoteObjectFilter enhancedNoteFindInIn) {
    super(id, context, "EnhancedNoteFind");
    enhancedNoteFindIn = enhancedNoteFindInIn;
  }

  public void translateToMap() {
    if (enhancedNoteFindIn != null) {
      Integer index =  enhancedNoteFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(enhancedNoteFindIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }


/**
 *
 * Sets the EnhancedNote
 * @param enhancedNoteFindInIn Value of the enhancedNoteFindIn
 *
 */

  public void setEnhancedNote(EnhancedNoteObjectFilter enhancedNoteFindInIn) {
    enhancedNoteFindIn = enhancedNoteFindInIn;
  }

  public void translateFromMap() {
    enhancedNoteFindIn = EnhancedNoteObjectHelper.fromMapFilter(inputMap, "EnhancedNote");
  }

/**
 *
 * Gets the EnhancedNote
 * @return Value of the EnhancedNote
 *
 */

  public EnhancedNoteObjectFilter getEnhancedNote( ) {
    return enhancedNoteFindIn;
  }

}
