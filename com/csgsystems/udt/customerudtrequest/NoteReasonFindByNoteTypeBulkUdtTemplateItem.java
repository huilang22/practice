/*
 * Generated code DO NOT EDIT
 * Generated file: NoteReasonFindByNoteTypeBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a NoteReasonFindByNoteTypeBulkUdtTemplateItem Bulk Template
 *
 */

public class NoteReasonFindByNoteTypeBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer noteTypeId;
  protected Integer languageCode;
/**
 *
 * Constructor to create a  NoteReasonFindByNoteTypeBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NoteReasonFindByNoteTypeBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer noteTypeIdIn, Integer languageCodeIn) {
    super(id, context, "NoteReasonFindByNoteType");
    noteTypeId = noteTypeIdIn;
    languageCode = languageCodeIn;
  }

  public void translateToMap() {
    if (noteTypeId != null) {
      addInput("NoteTypeId", noteTypeId);
    }
    if (languageCode != null) {
      addInput("LanguageCode", languageCode);
    }
  }


/**
 *
 * Sets the NoteTypeId
 * @param noteTypeIdIn Value of the noteTypeId
 *
 */

  public void setNoteTypeId(Integer noteTypeIdIn) {
    noteTypeId = noteTypeIdIn;
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
    noteTypeId = (Integer)inputMap.get("NoteTypeId");
    languageCode = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the NoteTypeId
 * @return Value of the NoteTypeId
 *
 */

  public Integer getNoteTypeId( ) {
    return noteTypeId;
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
