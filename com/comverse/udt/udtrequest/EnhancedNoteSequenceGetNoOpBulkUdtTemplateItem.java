/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EnhancedNoteSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EnhancedNoteSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EnhancedNoteObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   EnhancedNoteSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EnhancedNoteSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EnhancedNoteObjectKeyData noOpInIn) {
    super(id, context, "EnhancedNoteSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EnhancedNote", EnhancedNoteObjectKeyHelper.toMap(noOpIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
  }
/**
 *
 * Sets the  EnhancedNote
 * @param noOpInIn EnhancedNoteObjectKeyData to set
 *
 */
  public void setEnhancedNote(EnhancedNoteObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EnhancedNote passed into the constructor
 * @return Simulated response
 *
 */
  public EnhancedNoteObjectKeyData getEnhancedNote() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EnhancedNoteObjectKeyHelper.fromMap(inputMap, "EnhancedNote");
  }
}
