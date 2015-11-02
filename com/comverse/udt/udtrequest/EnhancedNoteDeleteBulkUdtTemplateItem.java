/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a EnhancedNoteDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EnhancedNoteDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EnhancedNoteObjectKeyData enhancedNoteDeleteIn;
/**
 *
 * Constructor to create a  EnhancedNoteDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EnhancedNoteDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, EnhancedNoteObjectKeyData enhancedNoteDeleteInIn) {
    super(id, context, "EnhancedNoteDelete");
    enhancedNoteDeleteIn = enhancedNoteDeleteInIn;
  }

  public void translateToMap() {
    if (enhancedNoteDeleteIn != null) {
      enhancedNoteDeleteIn.resetFlags(true, true);
      addInput("EnhancedNote", EnhancedNoteObjectKeyHelper.toMap(enhancedNoteDeleteIn, new HashMap(), "EnhancedNoteObjectKeyData").get("EnhancedNoteObjectKeyData"));
    }
  }


/**
 *
 * Sets the EnhancedNote
 * @param enhancedNoteDeleteInIn Value of the enhancedNoteDeleteIn
 *
 */

  public void setEnhancedNote(EnhancedNoteObjectKeyData enhancedNoteDeleteInIn) {
    enhancedNoteDeleteIn = enhancedNoteDeleteInIn;
  }

  public void translateFromMap() {
    enhancedNoteDeleteIn = EnhancedNoteObjectKeyHelper.fromMap(inputMap, "EnhancedNote");
  }

/**
 *
 * Gets the EnhancedNote
 * @return Value of the EnhancedNote
 *
 */

  public EnhancedNoteObjectKeyData getEnhancedNote( ) {
    return enhancedNoteDeleteIn;
  }

}
