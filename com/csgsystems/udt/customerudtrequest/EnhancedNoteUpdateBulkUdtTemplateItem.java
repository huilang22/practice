/*
 * Generated code DO NOT EDIT
 * Generated file: EnhancedNoteUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EnhancedNoteUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EnhancedNoteUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EnhancedNoteObjectData enhancedNoteUpdateIn;
/**
 *
 * Constructor to create a  EnhancedNoteUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EnhancedNoteUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, EnhancedNoteObjectData enhancedNoteUpdateInIn) {
    super(id, context, "EnhancedNoteUpdate");
    enhancedNoteUpdateIn = enhancedNoteUpdateInIn;
  }

  public void translateToMap() {
    if (enhancedNoteUpdateIn != null) {
      enhancedNoteUpdateIn.resetFlags(true, true);
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(enhancedNoteUpdateIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }


/**
 *
 * Sets the EnhancedNote
 * @param enhancedNoteUpdateInIn Value of the enhancedNoteUpdateIn
 *
 */

  public void setEnhancedNote(EnhancedNoteObjectData enhancedNoteUpdateInIn) {
    enhancedNoteUpdateIn = enhancedNoteUpdateInIn;
  }

  public void translateFromMap() {
    enhancedNoteUpdateIn = EnhancedNoteObjectHelper.fromMap(inputMap, "EnhancedNote");
  }

/**
 *
 * Gets the EnhancedNote
 * @return Value of the EnhancedNote
 *
 */

  public EnhancedNoteObjectData getEnhancedNote( ) {
    return enhancedNoteUpdateIn;
  }

}
