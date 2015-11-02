/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteGetBulkUdtTemplateItem.java
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
 * Class used to create a EnhancedNoteGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EnhancedNoteGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EnhancedNoteObjectKeyData enhancedNoteGetIn;
/**
 *
 * Constructor to create a  EnhancedNoteGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EnhancedNoteGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EnhancedNoteObjectKeyData enhancedNoteGetInIn) {
    super(id, context, "EnhancedNoteGet");
    enhancedNoteGetIn = enhancedNoteGetInIn;
  }

  public void translateToMap() {
    if (enhancedNoteGetIn != null) {
      enhancedNoteGetIn.resetFlags(true, true);
      addInput("EnhancedNote", EnhancedNoteObjectKeyHelper.toMap(enhancedNoteGetIn, new HashMap(), "EnhancedNoteObjectKeyData").get("EnhancedNoteObjectKeyData"));
    }
  }


/**
 *
 * Sets the EnhancedNote
 * @param enhancedNoteGetInIn Value of the enhancedNoteGetIn
 *
 */

  public void setEnhancedNote(EnhancedNoteObjectKeyData enhancedNoteGetInIn) {
    enhancedNoteGetIn = enhancedNoteGetInIn;
  }

  public void translateFromMap() {
    enhancedNoteGetIn = EnhancedNoteObjectKeyHelper.fromMap(inputMap, "EnhancedNote");
  }

/**
 *
 * Gets the EnhancedNote
 * @return Value of the EnhancedNote
 *
 */

  public EnhancedNoteObjectKeyData getEnhancedNote( ) {
    return enhancedNoteGetIn;
  }

}
