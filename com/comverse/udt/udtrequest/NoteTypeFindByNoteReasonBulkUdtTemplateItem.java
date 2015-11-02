/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NoteTypeFindByNoteReasonBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a NoteTypeFindByNoteReasonBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteTypeFindByNoteReasonBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer noteReasonId;
  protected Integer languageCode;
/**
 *
 * Constructor to create a  NoteTypeFindByNoteReasonBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteTypeFindByNoteReasonBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noteReasonIdIn, Integer languageCodeIn) {
    super(id, context, "NoteTypeFindByNoteReason");
    noteReasonId = noteReasonIdIn;
    languageCode = languageCodeIn;
  }

  public void translateToMap() {
    if (noteReasonId != null) {
      addInput("NoteReasonId", noteReasonId);
    }
    if (languageCode != null) {
      addInput("LanguageCode", languageCode);
    }
  }


/**
 *
 * Sets the NoteReasonId
 * @param noteReasonIdIn Value of the noteReasonId
 *
 */

  public void setNoteReasonId(Integer noteReasonIdIn) {
    noteReasonId = noteReasonIdIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param languageCodeIn Value of the languageCode
 *
 */

  public void setLanguageCode(Integer languageCodeIn) {
    languageCode = languageCodeIn;
  }

  public void translateFromMap() {
    noteReasonId = (Integer)inputMap.get("NoteReasonId");
    languageCode = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the NoteReasonId
 * @return Value of the NoteReasonId
 *
 */

  public Integer getNoteReasonId( ) {
    return noteReasonId;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return languageCode;
  }

}
