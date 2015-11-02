/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EnhancedNoteGroupedFindBulkUdtTemplateItem.java
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
 * Class used to create a EnhancedNoteGroupedFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EnhancedNoteGroupedFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EnhancedNoteObjectFilter enhancedNoteGroupedFindIn;
  protected String delimiter;
/**
 *
 * Constructor to create a  EnhancedNoteGroupedFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EnhancedNoteGroupedFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EnhancedNoteObjectFilter enhancedNoteGroupedFindInIn, String delimiterIn) {
    super(id, context, "EnhancedNoteGroupedFind");
    enhancedNoteGroupedFindIn = enhancedNoteGroupedFindInIn;
    delimiter = delimiterIn;
  }

  public void translateToMap() {
    if (enhancedNoteGroupedFindIn != null) {
      Integer index =  enhancedNoteGroupedFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EnhancedNote", EnhancedNoteObjectHelper.toMap(enhancedNoteGroupedFindIn, new HashMap(), "EnhancedNote").get("EnhancedNote"));
    }
    if (delimiter != null) {
      addInput("Delimiter", delimiter);
    }
  }


/**
 *
 * Sets the EnhancedNote
 * @param enhancedNoteGroupedFindInIn Value of the enhancedNoteGroupedFindIn
 *
 */

  public void setEnhancedNote(EnhancedNoteObjectFilter enhancedNoteGroupedFindInIn) {
    enhancedNoteGroupedFindIn = enhancedNoteGroupedFindInIn;
  }

/**
 *
 * Sets the Delimiter
 * @param delimiterIn Value of the delimiter
 *
 */

  public void setDelimiter(String delimiterIn) {
    delimiter = delimiterIn;
  }

  public void translateFromMap() {
    enhancedNoteGroupedFindIn = EnhancedNoteObjectHelper.fromMapFilter(inputMap, "EnhancedNote");
    delimiter = (String)inputMap.get("Delimiter");
  }

/**
 *
 * Gets the EnhancedNote
 * @return Value of the EnhancedNote
 *
 */

  public EnhancedNoteObjectFilter getEnhancedNote( ) {
    return enhancedNoteGroupedFindIn;
  }

/**
 *
 * Gets the Delimiter
 * @return Value of the Delimiter
 *
 */

  public String getDelimiter( ) {
    return delimiter;
  }

}
