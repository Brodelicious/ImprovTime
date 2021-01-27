import { TestBed } from '@angular/core/testing';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Http2ServerRequest } from 'http2';
import { Observable } from 'rxjs';
import { Activity } from '../models/setting';
import { UrlService } from './url.service';

import { SettingService } from './setting.service';

describe('SettingService', () => {
  let service: SettingService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SettingService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
